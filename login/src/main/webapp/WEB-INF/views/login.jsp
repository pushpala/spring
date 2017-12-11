<html>
<P>  The time on the server is ${serverTime}. </P>
<P> Error is  ${userError}. </P>
    <body>
        <form action="#" th:action="loginSubmit"  th:object="${userForm}" method= "post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" th:field= "*{username}" /></td>
                 
               </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" th:field="*{password}" /></td>
              
                </tr>
                <tr>
                    <td><button type="submit" value="Submit">Submit</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>