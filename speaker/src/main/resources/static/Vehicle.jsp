<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
   <title>Vehicle Purchase Form</title>
</head>
<body>
    <div class="form-container">
        <h2>Vehicle Purchase Form</h2>
        <form action="vehicle" method="post">
            <div class="form-group">
                <label for="vehicleNumber">Vehicle Number:</label>
                <input type="text" id="vehicleNumber" name="vehicleNumber" required value="${dto.vehicleNumber}">
            </div>
            <br>

            <div class="form-group">
                <label for="vehicleBrand">Vehicle Brand:</label>
                <select id="vehicleBrand" name="vehicleBrand" required>
                    <c:forEach items="${vehicleBrand}" var="brand">
                        <option value="${brand}">${brand}</option>
                    </c:forEach>
                </select>
            </div>

            <br>

            <div class="form-group">
                <label for="vehicleModel">Vehicle Model:</label>
                <select id="vehicleModel" name="vehicleModel" required>
                    <c:forEach items="${vehicleModel}" var="model">
                        <option value="${model}">${model}</option>
                    </c:forEach>
                </select>
            </div>

            <br>
            <div class="form-group">
                <label for="rentalAmount">Rental Amount:</label>
                <input type="number" id="rentalAmount" name="rentalAmount" required value="${dto.rentalAmount}">
            </div>

            <br>

            <div class="form-group">
                <label for="availability">Availability:</label>
                <select id="availability" name="availability" required>
                    <c:forEach items="${vehicleAvail}" var="avail">
                        <option value="${avail}">${avail}</option>
                    </c:forEach>
                </select>
            </div>

            <br>

            <button type="submit" class="submit-btn">Submit</button>

            ${success}
            <c:forEach items="${errors}" var="error">
                <div style="color: red">${error.defaultMessage}</div>
            </c:forEach>
        </form>
    </div>
</body>