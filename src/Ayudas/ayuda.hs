<?xml version="1.0" encoding="ISO-8859-1"?>
<helpset>
	<title>Ayuda de la aplicacion</title>
		<maps>
			<homeID>index</homeID>		
			<mapref location="ayuda.jhm"/>	
		</maps>
                
                <view>						
			<name>toc</name>
			<label>Tabla de contenidos sobre las ventanas</label>	
			<type>javax.help.TOCView</type>
			<data>ayudaTOC.xml</data>		
		</view>
                
                <view>						
			<name>indice</name>
			<label>Lista de ventanas</label>	
			<type>javax.help.IndexView</type>
			<data>ayudaIndice.xml</data>		
		</view>                
                
                <view>						
			<name>favoritos</name>
			<label>FAVORITOS</label>	
			<type>javax.help.FavoritesView</type>
		</view>                
                
                <!--<view>						
			<name>busqueda</name>
			<label>Búsqueda</label>	
			<type>javax.help.SearchView</type>
			<data engine="com.sun.java.help.search.DefaultSearchEngine">JavaHelpSearch</data>
		</view>-->               
                
                

                <presentation default="true" displayviews="false" displayviewimages="true">
			<name>MainWin</name>
			<size width="400" height="400"/>		
			<location x="200" y="100"/>			
			<title></title> 
			<toolbar>	
				<!-- Permitimos ir a la pï¿½gina anterior -->
				<helpaction image="BackwardIco">javax.help.BackAction</helpaction>
				<!-- Permitimos ir a la pï¿½gina siguiente -->
				<helpaction image="ForwardIco">javax.help.ForwardAction</helpaction>
                                <helpaction image="imgAnhadirFavorito">javax.help.FavoritesAction</helpaction>
				<!-- Permitimos imprimir el contenido -->
				<!--helpaction image="PrintIco">javax.help.PrintAction</helpaction-->
				<!-- Permitimos configurar la impresiï¿½n -->
				<!--helpaction image="PrintSetupIco">javax.help.PrintSetupAction</helpaction-->
			</toolbar>
		</presentation>                



</helpset>
