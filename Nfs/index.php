<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>NF - Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

<link href="../estilo.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}


//Fun��o responsavel por trocar as imagens   
function trocaImagens(imgName, imgSrc){

//Verifica se  o navegador suporta o objeto imagens
  if (document.images){
     if (imgSrc != "none"){
            document.images[imgName].src = imgSrc;
     }
  }
}
 
//Traca figura MouseOuver
function liga(cod) {
    if (cod == "txtLogin")
	{
      imgLogin = "url(../Figuras/txLogin2.jpg)";
	  login.style.backgroundImage = imgLogin;
	}
	else
	{
	  imgLogin = "url(../Figuras/txSenha2.jpg)";
	  Senha.style.backgroundImage = imgLogin;
	}
	if ( cod == "txtBanco") {
	  imgLogin = "url(../Figuras/txtBanco2.jpg)";
	  Banco.style.backgroundImage = imgLogin;
	}
	 
	/* else
	{
	  imgLogin = "url(../Figuras/txtBanco2.jpg)";
	  Banco.style.backgroundImage = imgLogin;
	} */
	
	eval("frmLogin."+cod+".style.backgroundColor='#CBE4CB'");
}

//Traca figura MouseOut
function desliga(cod) {
    if (cod == "txtLogin")
	{
      imgLogin = "url(../Figuras/txLogin1.jpg)";
	  login.style.backgroundImage = imgLogin;
	}
	else
	{
	  imgLogin = "url(../Figuras/txSenha1.jpg)";
	  Senha.style.backgroundImage = imgLogin;
	}
	
	if ( cod == "txtBanco") {
	  imgLogin = "url(../Figuras/txtBanco1.jpg)";
	  Banco.style.backgroundImage = imgLogin;
	}
	
	/* else
	{
	  imgLogin = "url(../Figuras/txtBanco1.jpg)";
	  Banco.style.backgroundImage = imgLogin;
	} */
	//txtBanco1.jpg
	eval("frmLogin."+cod+".style.backgroundColor='#FFFFFF'");
}
//-->
</script>
</head>

<body leftmargin="0" topmargin="10" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('../Figuras/btEntar2.jpg');document.frmLogin.txtLogin.focus()">
<form name="frmLogin" method="post" action="valida.php">
<div align="center">
  <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" class="tdFundo">
    <tr> 
      <td colspan="2">&nbsp;</td>
    </tr>
    <tr> 
        <td height="140" colspan="2">&nbsp;</td>
    </tr>
    <tr> 
        <td width="42%" height="150">&nbsp;</td>
        <td width="58%"> <table width="221" border="0" cellpadding="6" cellspacing="4">
            <tr> 
              <td width="213" height="28" valign="top" class="tdLogin" name="login" id="login"> 
                <div align="right"> 
                  <input name="txtLogin" type="text" class="txtLogin1" maxlength="10" onBlur="desliga(this.name);" onFocus="liga(this.name);">
                </div></td>
            </tr>
            <tr> 
              <td height="28" valign="top" class="tdSenha" id ="Senha"> <div align="right"> 
                  <input name="txtSenha" type="password" class="txtLogin1" maxlength="10" onBlur="desliga(this.name);" onFocus="liga(this.name);">
                </div></td>
            </tr>
			
			 <tr> 
              <td height="28" valign="top" class="tdBanco" id ="Banco"> <div align="right"> 
                  <input name="txtBanco" type="text" class="txtLogin1" maxlength="10"  onBlur="desliga(this.name);" onFocus="liga(this.name);" value="NT">
                </div></td>
            </tr> 
            <tr> 
              <td height="37" > <div align="center"><a href="Javascript:document.frmLogin.submit();" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('ImgBotao','','../Figuras/btEntar2.jpg',1)"><img src="../Figuras/btEntar1.jpg" name="ImgBotao" width="111" height="29" border="0"></a></div></td>
            </tr>
          </table>
          <div align="left"></div></td>
    </tr>
    <tr> 
      <td colspan="2">&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
