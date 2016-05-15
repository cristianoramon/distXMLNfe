<?php
/******************************************************************
 *
 *
 *****************************************************************/
 
   
 require_once("cGerarXmlNfs.php");
	
 $xmlGerarNf = new cGerarXmlNfs("Autorizacao.xml");
	
	
 $xmlGerarNf->setNoValor("xNome","Ramon Cristiano Bezerra Tavares","id","fisco");
	
 $xmlGerarNf->save("NfsCorreto.xml");
	
?>
