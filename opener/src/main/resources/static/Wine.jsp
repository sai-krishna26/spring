<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wine</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="d-flex justify-content-center align-items-center vh-100">
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h3 class="text-center mb-4">Hi, you have taken a glass of wine,Let's fill the form</h3>

            <form action="Wine" method="post" class="card p-4 shadow">

    <div class="form-field mb-3">
        <label for="companyName" class="form-label">Company Name</label>
        <input type="text" class="form-control" id="companyName" name="companyName" placeholder="eg: Zindani" required>
    </div>

    <div class="form-field mb-3">
        <label for="location" class="form-label">Location</label>
        <select class="form-control" id="location" name="location" required>
            <c:forEach items="${companyLocation}" var="location">
                <option value="${location}">${location}</option>
            </c:forEach>
        </select>
    </div>

    <div class="form-field mb-3">
        <label for="mnfName" class="form-label">Manufacturer Name</label>
        <input type="text" class="form-control" id="mnfName" name="mnfName" placeholder="eg: Sula Vineyards Ltd" required>
    </div>

    <div class="form-field mb-3">
        <label for="mnfDate" class="form-label">Manufacturing Date</label>
        <input type="date" class="form-control" id="mnfDate" name="mnfDate" required>
    </div>

    <div class="form-field mb-3">
        <label for="variety" class="form-label">Variety</label>
        <input type="text" class="form-control" id="variety" name="variety" placeholder="eg: Cabernet Sauvignon" required>
    </div>

    <div class="form-field mb-3">
        <label for="age" class="form-label">Age</label>
        <input type="number" class="form-control" id="age" name="age" placeholder="eg: 10" required min="1">
    </div>

    <button type="submit" class="btn btn-primary w-100">Submit</button>

                <div style="color:green">${message}</div>
                    <c:forEach items="${errors}" var="error">
                    <div style="color:red">${error.defaultMessage}</div>
                    </c:forEach>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>