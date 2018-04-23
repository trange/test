<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<meta http-equiv="Content-Style-Type" content="text/css"/>
		<meta http-equiv="Content-Script-Type" content="text/javascript"/>
		<meta http-equiv="imagetoolbar" content="no"/>
		<meta name="description" content=""/>
		<meta name="keywords" content=""/>
		<title>TEST PAGE</title>

		<style type="text/css">
		/* ========TAG LAYOUT======== */
		body {
			margin: 0;
			padding: 0;
			line-height: 1.6;
			letter-spacing: 1px;
			font-family: Verdana, Helvetica, sans-serif;
			font-size: 12px;
			color: #333;
			background: #fff;
		}
		table {
			text-align: center;
			margin: 0 auto;
		}
		ul {
			clear: right;
			font-color: white;
		}
		/* ========ID LAYOUT======== */
		#top {
			width: 780px;
			margin: 30px auto;
			border: 1px solid #333;
		}
		#header {
			width:100%;
			height: 80px;
			background-color: black;
		}
		#header h1{
			float: lift;
			color: white;
		}
		#main {
			width:100%;
			height: 500px;
			text-align: center;
		}
		#footer {
			width: 100%;
			height: 80px;
			background-color: black;
			clear: both;
		}
		#log {
			clear: left;
			font-color: white;
		}
		#menu li{
			float:right;
			list-style:none;
			color:white;
			font-size: 20px;
			line-height: 80px;
			padding-left:20px;
			padding-right:40px;
		}
		#right {
			button-size: 1000px;
			background-color: orange;
		}
		</style>
	</head>

	<body>
		<div id="logo">
			<h1>ＴＥＳＴ</h1>
		</div>
		<div id = "header">
			<div id="menu">
				<ul>
					<li><a href='<s:url action="UserPageAction" />'>ログアウト</a></li>
					<li><a href='<s:url action="CreatorAction" />'>お問い合わせ</a></li>
					<li><a href='<s:url action="CreatorAction" />'>TOP</a></li>
				</ul>
			</div>
		</div>

		<div id = "main">

			<div id = "left">
				<h1>購入者の方はこちら</h1>
				<div>
					<s:form action = "UserAction">
						<s:submit value = "こちら"/>
					</s:form>
				</div>
			</div>

			<div id = "right">
				<div>
					<s:form action = "CreatorAction">
						<s:submit type="button" value = "販売者の方はこちら"/>
					</s:form>
				</div>
			</div>

		</div>

		<div id = "footer">
			<div id = "pr">
			<h1>copyright innternous|4each blog is the one which provides A to Z about programming.</h1>
			</div>
		</div>

	</body>

</html>