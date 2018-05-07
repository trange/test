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
		<title>クリエーターお問い合わせ</title>

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
		input[name=creatorContact]{
			width:200px;
			height:50px;
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
		</style>
	</head>

	<body>

		<div id="header">

			<div id="pr">
			</div>

		</div>

		<div id="main">

			<div id="top">
				<p>クリエーターお問い合わせ</p>
			</div>

			<div>

				<s:if test="errorMassage !=">
					<s:property value="errorMassage" escape="false"/>
				</s:if>

				<table>

					<s:form action="CreatorContactAction">

						<tr>

							<td>
								<label>クリエーターID:</label>
							</td>

							<td>
								<input type="text" name="creatorId" value=""/>
							</td>

						</tr>

						<tr>

							<td>
								<label>メールアドレス:</label>
							</td>

							<td>
								<input type="text" name="creatorMell" value=""/>
							</td>

						</tr>

						<tr>

							<td>
								<label>お問い合わせ種類:</label>
							</td>

							<td>
								<select name="creatorContect">
									<option value="1" selected="selected">商品について</option>
									<option value="2">配送について</option>
									<option value="3">返送について</option>
									<option value="4">ユーザーについて</option>
									<option value="5">その他</option>
								</select>
							</td>

						</tr>

						<tr>

							<td>
								<label>お問い合わせ内容:</label>
							</td>

							<td>
								<input type="text" name="creatorContact" value=""/>
							</td>

						</tr>

						<s:submit value="送信"/>

					</s:form>

				</table>

				<div>
					<span>前画面に戻る場合は</span>
					<a href='<s:url action="CreateItemAction" />'>こちら</a>
				</div>

			</div>

		</div>

		<div id="footer">

			<div id="pr">
			</div>

		</div>

	</body>

</html>
