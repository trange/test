<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>

	<head>

		<meta charset="utf-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />

		<title>Home画面</title>

		<style type="text/css">
			body {
			   margin:0;
			   padding:0;
			   line-height:1.6;
			   letter-spacing:1px;
			   font-family:Verdana, Helvetica, sans-serif;
			   font-size:12px;
			   color:#333;
			   background:#fff;
			}

			table {
				text-align:center;
				margin:0 auto;
			}

			/* ========TEMPLATE LAYOUT======== */
			#top {
			   width:780px;
			   margin:30px auto;
			   border:1px solid #333;
			}

			#header {
			   width: 100%;
			   height: 80px;
			   background-color: black;
			}

			#main {
			   width: 100%;
			   height: 500px;
			   text-align: center;
			}

			#footer {
				width: 100%;
				height: 80px;
				background-color: black;
				clear:both;
				font-color: white;
			}

			#text-center {
				margin: left;
			}

			input.user {
				position: relative;
				display: inline-block;
				padding: 5em 5em;
				text-decoration: none;
				color: #FFF;
				background: #fd9535;/*背景色*/
				border-bottom: solid 2px #d27d00;/*少し濃い目の色に*/
				border-radius: 4px;/*角の丸み*/
				box-shadow: inset 0 2px 0 rgba(255,255,255,0.2), 0 2px 2px rgba(0, 0, 0, 0.19);
				font-weight: bold;
			}

			input.user:active {
				border-bottom: solid 2px #fd9535;
				box-shadow: 0 0 2px rgba(0, 0, 0, 0.30);
			}

			input.creator {
				position: relative;
				display: inline-block;
				padding: 5em 5em;
				text-decoration: none;
				color: #FFF;
				background: green;/*背景色*/
				border-bottom: solid 2px #d27d00;/*少し濃い目の色に*/
				border-radius: 4px;/*角の丸み*/
				box-shadow: inset 0 2px 0 rgba(255,255,255,0.2), 0 2px 2px rgba(0, 0, 0, 0.19);
				font-weight: bold;
			}

			input.creator:active {
				border-bottom: solid 2px #fd9535;
				box-shadow: 0 0 2px rgba(0, 0, 0, 0.30);
			}

		</style>

	</head>


	<body>

		<div id="header">

		 	<div id="pr">
			</div>

		</div>

		<div id="main">

			<div id="top">

				<p>Home</p>

			</div>


			<div id="text-center">

				<s:form action="HomeAction">
					<input class="user" type="submit" value="ユーザーログイン"/>
				</s:form>

				<s:form action="HomeAction">
					<input class="creator" type="submit" value="クリエーターログイン"/>
				</s:form>

				<s:if test="#session.id != null">
					<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
				</s:if>

				<s:if test="#session.masterId != null">
					<a href='<s:url action="LogoutAction"/>'>ログアウト</a>
				</s:if>

			</div>

		</div>

		<div id="footer">

		 	<div id="pr">
			</div>

		</div>

	</body>

</html>