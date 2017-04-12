<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-4 col-md-8" id="homestay">
                    <div class="card">
                        <h3 class="card-header">My Homestay</h3>
                        <div class="card-block">
                            <form action="/Homestay" method="POST">
                                <div class="form-group has-feedback" id="homestayNameInDiv">
                                    <label for="homestayname">Homestay Name</label>
                                    <input type="text" class="form-control" name="homestayname" id="homestayNameIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="priceInDiv">
                                    <label for="price">Price</label>
                                    <input type="text" class="form-control" name="price" id="priceIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="guestInDiv">
                                    <label for="guest">Guest</label>
                                    <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="latitudeInDiv">
                                    <label for="latitude">Homestay Address</label>
                                    <textarea class="form-control" name="address" id="addressIn" rows="3"></textarea>
                                </div>
                                <div class="form-group has-feedback" id="latitudeInDiv">
                                    <label for="latitude">Latitude</label>
                                    <input type="text" class="form-control" name="latitude" id="latitudeIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="longtitudeInDiv">
                                    <label for="longtitude">Longtitude</label>
                                    <input type="text" class="form-control" name="longtitude" id="longtitudeIn" placeholder="" required>
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary btn-block" id="addHomestayButton">Add Homestay</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />