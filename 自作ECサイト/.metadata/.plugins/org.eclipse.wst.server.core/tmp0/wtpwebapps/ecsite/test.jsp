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
		<meta charset="utf-8">

		<title>UserCreate画面</title>

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
				height: 800px;
				text-align: center;
			}

			#footer {
				width: 100%;
				height: 80px;
				background-color: black;
				clear:both;
			}
		</style>

	</head>

	<body>

		<!-- ヘッダー -->
		<div id="header">
		 	<div id="pr">
			</div>
		</div>

		<div id="main">

			<!-- 見出し -->
			<div id="top">
				<p>UserCreate</p>
			</div>

			<div>

				<!-- 未入力項目があった場合のエラー -->
				<s:if test="errorMassage != ''">
					<h3><s:property value="errorMassage" escape="false" /></h3>
				</s:if>

				<!-- 登録内容入力 -->
				<table>

					<s:form action="UserCreateConfirmAction">

						<!-- メールアドレス入力 -->
						<tr>
							<td>
								<label>ログインID (メールアドレス):</label>
							</td>
							<td>
								<input type="text" name="loginUserId" placeholder="○○○@○○○" />
							</td>
						</tr>

						<!-- メールアドレス入力(確認) -->
						<tr>
							<td>
								<label>確認用：</label>
							</td>
							<td>
								<input type="text" name="checkLoginId" placeholder="○○○@○○○" />
							</td>
						</tr>

						<tr>
							<td>
								<br>
							</td>
						</tr>

						<!-- パスワード入力 -->
						<tr>
							<td>
								<label>ログインPASS (パスワード):</label>
							</td>
							<td>
								<input type="password" name="loginPassword" placeholder="8文字以上16文字以下" />
							</td>
						</tr>

						<!-- パスワード入力(確認) -->
						<tr>
							<td>
								<label>確認用：</label>
							</td>
							<td>
								<input type="password" name="checkPassword" placeholder="8文字以上16文字以下" />
							</td>
						</tr>

						<tr>
							<td>
								<br>
							</td>
						</tr>

						<!-- ユーザー名入力 -->
						<tr>
							<td>
								<label>ユーザー名 (氏名):</label>
							</td>
							<td>
								<input type="text" name="userName" placeholder="山田太郎" />
							</td>
						</tr>

						<!-- 性別選択 -->
						<tr>
							<td>
								<label>性別：</label>
							</td>
							<td>
								<input type="radio" name="sex" value="男" checked="checked">男
								<input type="radio" name="sex" value="女">女
							</td>
						</tr>

						<tr>
							<td>
								<br>
							</td>
						</tr>

						<!-- 住所入力項目 -->
						<tr>
							<td>
								<label>住所</label>
							</td>
						</tr>

						<!-- 都道府県入力 -->
						<tr>
							<td>
								<label>都道府県：</label>
							</td>
							<td>
								<input type="text" name="userAddress1" placeholder="○○都/道/府/県" />
							</td>
						</tr>

						<!-- 市町村入力 -->
						<tr>
							<td>
								<label>市町村：</label>
							</td>
							<td>
								<input type="text" name="userAddress2" placeholder="○○市/町/村" />
							</td>
						</tr>

						<!-- 詳細入力 -->
						<tr>
							<td>
								<label>番地、マンション名：</label>
							</td>
							<td>
								<input type="text" name="userAddress3" placeholder="0-0-0　～団地　0-000号室" />
							</td>
						</tr>

						<tr>
							<td>
								<br>
							</td>
						</tr>

						<!-- 電話番号入力 -->
						<tr>
							<td>
								<label>携帯番号：</label>
							</td>
							<td>
								<input type="text" name="tell" placeholder="000-0000-0000" />
							</td>
						</tr>

						<tr>
							<td>
								<br>
							</td>
						</tr>

						<!-- 登録ボタン -->
						<s:submit value="登録"/>

					</s:form>

				</table>

				<!-- HOMEに戻る -->
				<div>
					<span>前画面に戻る場合は</span><a href='<s:url action="HomeAction" />'>こちら</a>
				</div>

			</div>

		</div>

		<!-- フッター -->
		<div id="footer">
			<div id="pr">
			</div>
		</div>

	</body>

</html>