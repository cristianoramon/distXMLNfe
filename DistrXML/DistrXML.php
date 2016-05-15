<? 
   session_start();
   set_time_limit(700000000000);
	
	 //Tnsname
     require_once("../tnsNames/cTsnames.php");
 
    //Classe que Procurar pelo Arquivos
     require_once("../ProcuraArq/cVarreArq.php");
   
   //Retorno o valor do xml
    require_once("../Nfs/cValorXml.php");
   
   //Include Necessaria para o XML
    require_once("../Nfs/cGerarXmlNfs.php");
	
    //Enviar o XML
    require_once("../xmlSign/cEnviaNF.php");
	
	
    
	//Gravar no Banco
    require_once("../cNFSaidas.php");
 
    //Classe Configuracao
    require_once("../Nfs/cConfigura.php");

  //Objetos
   $cVarre = new cVarreArq(); 
   $cValorXml = new cValorXml(NULL, NULL,NULL,NULL);
   
   $tnsName = new cTnsName();
   $cGrava  = new cNFSaidas();
   $cConf    = new cConfigura();

?>

<html><head>

<script language="JavaScript" type="text/JavaScript">
<!--



function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

//Imprimir relatorio
function Impr() {
  if (typeof(window.print) != 'undefined'){ 
    window.print(); 
  } 
}
//-->
</script>
<link href="../../estilo.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style2 {
	color: #FFFFFF;
	font-weight: bold;
}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"></head>

<body>
<table width="62%" height="243" border="0" align="left" cellpadding="0" cellspacing="0">
  <tr> 
    <td width="100%" height="128" align="center" background="../Figuras/NfSaidaTopo1.jpg" style="background-repeat: no-repeat;"></td>
  </tr>
  <tr> 
    <td height="25"  background="../Figuras/FundoTitulo.jpg" class="tdTitFundo"> 
      <div align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Nota fiscal Eletr&ocirc;nica para Distribui&ccedil;&atilde;o </div></td>
  </tr>
  <tr> 
    <td width="100%" align="right" height="81" valign="top"> <table width="100%"  border="1" align="left" cellpadding="0" cellspacing="0" bordercolor="#99CC99">
      <tr>
          <td width="13%" valign="top">          
          <td width="71%" valign="top">          
          <td width="16%" valign="top">        
        <tr>
          <td valign="top">      
          <td valign="top">          
          <td valign="top">        
        
              <? 
			 
		
				

			  
			  
		 //Banco
		 $db = $tnsName->fTnsNames($_SESSION['banco']);
		 $conn = ocilogon($_SESSION['login'], $_SESSION['senha'], $db );
		 /*****/
		      
         $dirResposta = array();
         $tipoArquivo = array();

         $dirRespostaArq[0] = "../xml/xml_assinado/" .$_SESSION['login'] ."/".$_SESSION["empresa"]."/";

         $dirRespostaArq[1] = "../../../xml/xml_assinado_contigente/" .$_SESSION['login'] ."/".$_SESSION["empresa"]."/";

           
         //$dirRespostaArq[1] = "C:/xamppWeb/htdocs/nfeV3/xml/xml_assinado_contigente/SINIMBU/001/";
        
         $tipoArquivo[0] = "xml_assinado";
         $tipoArquivo[1] = "xml_assinado_contigente";

         $qtDir =  (int) count($dirRespostaArq);
         
         $qtArray = 0;
         //exit();
         
         for ( $qtArq = 0 ; $qtArq < $qtDir; $qtArq++) {
         
         
               //echo realpath($dirRespostaArq[$qtArq])." 1...<br>";
               
		      //Varre o diretorio a procura de nota
		      $vetor=$cVarre->fVarrArq($dirRespostaArq[$qtArq],$filtro="",$nivel="",1);
			  
		      $qt =   count($vetor);
			  
			 //  echo '<br>'.$qtArq ;
            // echo "<br>$qtArq".$dirRespostaArq[$qtArq];

             //$qtArray++;
             
			  for ( $qtNota = 0 ; $qtNota < count($vetor) ; $qtNota++ ) {
			  	
				
				//$dirResposta = "../../" . $dirRespostaArq[$qtArq];
				
				
				$dirResposta = "../../../xml/" . $tipoArquivo[$qtArq]."/" .$_SESSION['login'] ."/".$_SESSION["empresa"]."/";
				$dirTotal = realpath($dirResposta.$vetor[$qtNota]);
				
				
				//echo $dirTotal;
				$nfeXML = '';
				$nfeXMLSig = '';
				
				
				$nfeXML = $cValorXml->ValorXmlNameSpace("//NFe",$dirTotal);
				
				$nfeXMLSig = $cValorXml->ValorXmlNameSpace("//NFe//Signature",$dirTotal);
				
				$nfeData = $cValorXml->ValorXmlNameSpace("//dSaiEnt",$dirTotal);
				
				$nfeCliente =  ltrim(rtrim(substr($cValorXml->ValorXmlNameSpace("//dest//xNome",$dirTotal),0,30)));
                
				//echo "<br>--s ".$nfeXML["SignedInfo"]." s ---------<br>";
				$arraySub = array(" ", "  ", "    ","/","&");
				$nfeCliente = str_replace($arraySub, "_", $nfeCliente);
                $nfeData = 'data_'. str_replace("-","_",$nfeData) . "_";

				//echo "<br>--".$nfeCliente;
				//var_dump( $nfeXML );
				

                //echo htmlentities($nfeXML);
                

				if ( strlen( $nfeCliente ) > 5 ) 
				   $nfeXML = $nfeXML->asXML();
				 

				//echo htmlentities($nfeXML);
				
				$dirResposta = "../../../xml/xml_resposta_recibo/" .$_SESSION['login'] ."/".$_SESSION["empresa"]."/";  
				$dirTotal = $dirResposta.$vetor[$qtNota];
		
				
				
				$nfeRecXML = '';
				
				if ( file_exists( $dirTotal ) ) {
				
				  $nfeRecXML = $cValorXml->ValorXmlNameSpace("//protNFe",$dirTotal); 
				  
				  if (  $nfeRecXML != null )
				   $nfeRecXML = $nfeRecXML->asXML();
				  
				  
				  $dirResposta ="../../../xml/xml_distribuicao/" .$_SESSION['login'] ."/";
				
				  if (   ! is_dir( $dirResposta ) )  			
				   mkdir( $dirResposta );
				   
				   
				  $dirResposta = "../../../xml/xml_distribuicao/" .$_SESSION['login'] ."/".$_SESSION["empresa"]."/"; 
                  
				  if (   ! is_dir( $dirResposta ) )  			
				   mkdir( $dirResposta );
				   
				  $dirResposta = $dirResposta."/".$nfeCliente;
				
				  if (   ! is_dir( $dirResposta ) )  			
				   mkdir( $dirResposta );
				
				
				  //echo '<br>--'.realpath($dirResposta);
				 
				
				
				  $nfeXML = str_replace("ns=\"http://www.portalfiscal.inf.br/nfe\"","xmlns=\"http://www.portalfiscal.inf.br/nfe\"",$nfeXML);

                  $xmlIni = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?" .">"."<nfeProc xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.10\">";
                  //$xmlIni = $xmlIni . '<NFe>';
				  $xmlIni = $xmlIni . $nfeXML;
				  $xmlIni = $xmlIni . $nfeRecXML;
                  $xmlIni = $xmlIni . $nfeXMLSig[0];
                  //$xmlIni = $xmlIni . '</NFe>';
				  $xmlIni = $xmlIni . '</nfeProc>';
				 $xmlIni =  str_replace("ns=\"http://www.w3.org/2000/09/xmldsig#\"","xmlns=\"http://www.w3.org/2000/09/xmldsig#\"",$xmlIni  );
				  
				  //echo "<br>tt ". htmlentities($xmlIni)." tt<br>";
				  //var_dump("<br>tt ". html_encode($xmlIni)." tt<br>");

                 if ( $qtArq == 0 )
                   $obs="NORMAL";
                 else
                   $obs="CONTIGENCIA";
                   
				 $dirResposta = $dirResposta . "/".$nfeData."_".$obs."_".$vetor[$qtNota];
				

				  if ( ! file_exists( $dirResposta ) ) {
				
				    if ( (  $fp = fopen($dirResposta, "w+") ) ) {
				  
				      fwrite($fp,$xmlIni);
					  fclose($fp);
				    }
				  }
				 } 
				
			

			  }	
           }
			  
			?>
        <tr>
          <td colspan="3" valign="top" bgcolor="#3DAA69">        <div align="center"><span class="style2">Quantidade de Notas : <?  echo $qt;?>
            </span>
            </div>
        <tr>
          <td width="13%" colspan="3" valign="top">          <form name="form1" method="post" action="">
              <div align="center"></div>
          </form> 
        </table>
</table>
</body>
</html>
