
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple Receipt</title>
</head>
<body>

<h1>customer name: <c:out value="${name}"/></h1>
<p>item name: <c:out value="${itemName}"/></p>
<p>item Price: <c:out value="${price}"/></p>
<p>description: <c:out value="${description}"/></p>
<p>Vendor: <c:out value="${vendor}"/></p>

</body>
</html>