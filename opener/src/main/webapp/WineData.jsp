<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Wine Data</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <h4 style="text-align: center;">Wine Data Table</h4>
    <div class="table-responsive">
        <table class="table table-sm" data-bs-theme="dark">
            <thead>
            <tr>
                <th>Company Name</th>
                <th>Location</th>
                <th>Manufacturer Name</th>
                <th>Manufacturing Date</th>
                <th>Variety</th>
                <th>Wine Age</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach items="${wineDtoList}" var="wineDto">
                <tr>
                    <td>${wineDto.companyName}</td>
                    <td>${wineDto.location}</td>
                    <td>${wineDto.mnfName}</td>
                    <td>${wineDto.mnfDate}</td>
                    <td>${wineDto.variety}</td>
                    <td>${wineDto.age}</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>