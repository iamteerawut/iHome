<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.isNew()) {  %><jsp:include page="templates/header.jsp" /><% } else { %><jsp:include page="templates/headerauth.jsp" /><% }%>
        <div class="container mt-5">
            <div class="row">
                <div class="col-5">
                    <div class="card">
                        <h3 class="card-header">Booking Number - #00001</h3>
                        <div class="card-block">
                            <p class="card-text">Booking Number : <small class="text-muted">00001</small></p>
                            <p class="card-text">Pincode : <small class="text-muted">1234</small></p>
                            <p class="card-text">Name : <small class="text-muted">Teerawut Kitbunjerdjarud</small></p>
                            <p class="card-text">Phone Number : <small class="text-muted">055-555-555</small></p>
                            <p class="card-text">Email : <small class="text-muted">example@example.com</small></p>
                        </div>
                    </div>
                </div>
                <div class="col-7">
                    <div class="card">
                        <h3 class="card-header">Booking Detail</h3>
                        <div class="card-block">
                            <p class="card-text">Homestay Name : <small class="text-muted">Example 1</small></p>
                            <p class="card-text">Booking Detail : <small class="text-muted">2 nights, 1 Room, 2 People</small></p>
                            <p class="card-text">Checkin : <small class="text-muted">31/03/2017</small></p>
                            <p class="card-text">Checkout : <small class="text-muted">02/04/2017</small></p>
                            <p class="card-text">Room Price : <small class="text-muted">3000 THB</small></p>
                            <p class="card-text">Contact : <small class="text-muted">012-345-678</small></p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row mt-4">
                <div class="col-12">
                    <div id="map" style="height:400px"></div>
                    <script>
                        function initMap() {
                            var uluru = {lat: 13.730994, lng: 100.781260};
                            var map = new google.maps.Map(document.getElementById('map'), {
                                zoom: 17,
                                center: uluru
                            });
                            var marker = new google.maps.Marker({
                                position: uluru,
                                map: map
                            });
                        }
                    </script>
                </div>
            </div>
            <div class="row justify-content-center mt-5">
                <div class="col-1">
                    <button type="button" class="btn btn-primary btn-lg">Print</button>
                </div>
            </div>
        </div>
<jsp:include page="templates/modal.jsp" />
<jsp:include page="templates/footer.jsp" />