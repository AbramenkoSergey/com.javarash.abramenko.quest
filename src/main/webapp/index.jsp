<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Final task M3</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">

</head>
<body>


<h2>Где-то на просторах Империума.</h2><br>
 <div style="text-align: center;"><img src="logo.jpg" ></div>
 <br>
<h6>Прогуливаясь по библиотеке Вы замечаете старый инфопланшет с которого  местами  стерлась  краска, поскольку Вы здесь ждали  связного, а
    он  задерживался, чтобы  скоротать время, то  узнать что  на нем было ни чуть не хуже чем просто  блуждать  между пыльными  полками.
По этой причене Вы не раздумывая взяли этот  инфоплатшет в руки и оживили нажатием  кнопки питания, через несколько  секунд экран попросил
представиться, это было необычно по этой причине  Вы  ввели имя, которое первое пришло в голову</h6>

<%--TO: DO через цилкл раскидать статистику--%>
<c:if test="${username== null}" >
<form action="start-story", method="POST">
    Name: <input name="username" />
    <input type="submit" value="Accept" />
</form>
</c:if>
<c:if test="${username!= null}" >
<form action="heresy" method="POST">
    <input type="submit" value="Heresy" />
</form>
<form action="Inquisition" method="POST">
    <input type="submit" value="Inquisition" />
</form>
<form action="adeptus-arbites-servlet" method="POST">
    <input type="submit" value="Adeptus Arbites" />
</form>
</c:if>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js" integrity="sha384-k6d4wzSIapyDyv1kpU366/PK5hCdSbCRGRCMv+eplOQJWyd1fbcAu9OCUj5zNLiq" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.min.js" integrity="sha384-VQqxDN0EQCkWoxt/0vsQvZswzTHUVOImccYmSyhJTp7kGtPed0Qcx8rK9h9YEgx+" crossorigin="anonymous"></script>
</body>
</html>