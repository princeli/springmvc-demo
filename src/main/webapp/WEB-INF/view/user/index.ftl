<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>显示用户信息</title>
        <style type="text/css">
            table,td{
                border: 1px solid;
                border-collapse: collapse;
            }
        </style>
</head>
<body>
        <table>
            <tr>
                <td>用户ID</td>
                <td>用户名</td>
                <td>用户生日</td>
                <td>工资</td>
            </tr>
            <#list lstUsers as user>
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.userName}</td>
                    <td>${user.userBirthday?date}  </td>
                    <td>${user.userSalary}</td>
                </tr>
           	</#list>
        </table>
</body>
</html>