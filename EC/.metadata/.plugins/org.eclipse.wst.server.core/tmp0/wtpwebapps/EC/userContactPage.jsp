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

		<title>お問い合わせフォーム(ユーザー用)</title>

		<style type="text/css">

		/* ========TAG LAYOUT======== */
		body{
			margin: 0;
			padding: 0;
			line-height: 1.6;
			letter-spacing: 1px;
			font-family: Verdana, Helvetica, sans-serif;
			font-size: 12px;
			color: #333;
			background: #fff;
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
		#button {
			width: 100%;
			margin: auto;
		}

		</style>

	</head>



	<body>

		<div id = "header">
			<div id = "pr">
			</div>
		</div>

		<div id = "main">
			<div id="top">
				<h1>お問い合わせフォーム</h1>
			</div>

			<div>

				<s:if test="errorMassage !=">
					<s:property value="errorMassage" escape="false"/>
				</s:if>

					<s:form action="UserContactAction">

						<h2>ユーザーID</h2>
						<input type="text" name="loginUserId" value=""/>

						<h2>お問い合わせ種類</h2>
							<select name="contact">
								<option value="Item" selected="selected">商品について</option>
								<option value="delivery">発送について</option>
								<option value="creator">出品者について</option>
								<option value="unsubscribe">退会について</option>
								<option value="other">その他</option>
							</select>

						<h2>お問い合わせ内容</h2>
							<input type="text" name="contect" value=""/>

						<div id = "button">
							<s:submit value="送信"/>
						</div>

					</s:form>

			</div>

		</div>


	</body>


</html>