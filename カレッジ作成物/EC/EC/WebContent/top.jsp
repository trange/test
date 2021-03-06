<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />

		<title>TOPページ</title>

		<style type="text/css">

		/* ========TAG LAYOUT======== */

		body {
			margin: 0;
			padding: 0;
			line-height: 1.6;
			letter-spacing: 1px;
			font-family: impact, "arial black", sans-serif;
			font-size: 12px;
			color: #333;
			background: #fff;
		}

		table {
			text-align: center;
			marzin: 0 auto;
		}

		/* ========ID LAYOUT======== */

		#top {
			width:780px;
			margin: 30px auto;
			border: 1px solid #333;
		}

		#header {
			width: 100%;
			height: 80px;
			background-color: black;
			font-color: white;
		}

		#header h1{
			text-align: center;
			font-size: 30px;
			font-color: white;
		}

		#main {
			clear: left;
			width: 100%;
			height:500px;
			text-align: center;
		}

		#right {
			float: right;
			width: 30%;
			height: 250px;
			text-align: center;
			border: 1px dashed orange;
			border-radius: 50px, 50px;
			margin-top: 125px;
			margin-right: 10%;
		}

		#left {
			float: left;
			width: 30%;
			height: 250px;
			text-align: center;
			border: 1px dashed lightgreen;
			margin-top: 125px;
			margin-left: 10%;
		}

		#footer {
			width: 100%;
			height: 80px;
			background-color: black;
			clear: both;
		}

		#footer h1 {
			text-align: center;
			font-size: 30px;
			text-color: white;
		}

		</style>

	</head>

	<body>

		<div id = "header">
			<div id = "pr">
				<h1>INTERNOUS商品販売</h1>
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
				<h1>販売者の方はこちら</h1>
				<div>
					<s:form action = "CreatorAction">
						<s:submit value = "こちら"/>
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