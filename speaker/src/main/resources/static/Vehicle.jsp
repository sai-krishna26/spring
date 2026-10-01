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
                <input type="text" id="vehicleNumber" name="vehicleNumber" required minlength="3" maxlength="30" placeholder="Enter vehicle number">
            </div>
            <br>

            <div class="form-group">
                <label for="vehicleBrand">Vehicle Brand:</label>
                <select id="vehicleBrand" name="vehicleBrand" required>
                    <option value="">-- Select Brand --</option>
                    <option value="Toyota">Toyota</option>
                    <option value="Honda">Honda</option>
                    <option value="Ford">Ford</option>
                    <option value="BMW">BMW</option>
                    <option value="Mercedes">Mercedes</option>
                    <option value="Audi">Audi</option>
                    <option value="Hyundai">Hyundai</option>
                    <option value="Maruti">Maruti</option>
                    <option value="Tata">Tata</option>
                    <option value="Mahindra">Mahindra</option>
                </select>
            </div>

            <br>

            <div class="form-group">
                <label for="vehicleModel">Vehicle Model:</label>
                <select id="vehicleModel" name="vehicleModel" required>
                    <option value="">-- Select Model --</option>
                    <option value="Sedan">Sedan</option>
                    <option value="SUV">SUV</option>
                    <option value="Hatchback">Hatchback</option>
                    <option value="Coupe">Coupe</option>
                    <option value="Convertible">Convertible</option>
                    <option value="MPV">MPV</option>
                    <option value="Pickup">Pickup</option>
                    <option value="Wagon">Wagon</option>
                </select>
            </div>

            <br>
            <div class="form-group">
                <label for="rentalAmount">Rental Amount:</label>
                <input type="number" id="rentalAmount" name="rentalAmount" required min="0" step="0.01" placeholder="Enter rental amount">
            </div>

            <br>

            <div class="form-group">
                <label for="availability">Availability:</label>
                <select id="availability" name="availability" required>
                    <option value="">-- Select Availability --</option>
                    <option value="true">Available</option>
                    <option value="false">Not Available</option>
                </select>
            </div>

            <br>

            <button type="submit" class="submit-btn">Submit</button>

            ${success}
            ${errors}
            <c:forEach items="${errors}" var="error">
                <div class="alert alert-danger">${error.defaultMessage}</div>
            </c:forEach>
        </form>
    </div>
</body>