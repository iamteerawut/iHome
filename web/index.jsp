<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<div class="container">
    <div class="row hidden-sm-down">
        <div class="col-2">
            <a href="${SITE_URL}/ViewHomestay/?id=1">
            <img src="${SITE_URL}/asset/img/homestay/1.jpg" alt="..." class="d-block" style="height: 100%; width: 100%">
            </a>
        </div>
        <div class="col-4">
            <a href="${SITE_URL}/ViewHomestay/?id=2">
            <img src="${SITE_URL}/asset/img/homestay/2.jpg" alt="..." class="d-block" style="height: 100%; width: 100%">
            </a>
        </div>
        <div class="col-2">
            <a href="${SITE_URL}/ViewHomestay/?id=3">
            <img src="${SITE_URL}/asset/img/homestay/3.jpg" alt="..." class="d-block" style="height: 100%; width: 100%">
            </a>
        </div>
        <div class="col-4">
            <a href="${SITE_URL}/ViewHomestay/?id=4">
            <img src="${SITE_URL}/asset/img/homestay/4.jpg" alt="..." class="d-block" style="height: 100%; width: 100%">
            </a>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-2 hidden-sm-down">
            <a href="${SITE_URL}/ViewHomestay/?id=5">
            <img src="${SITE_URL}/asset/img/homestay/5.jpg" alt="..." class="w-100 mt-4 mb-2">
            </a>
            <a href="${SITE_URL}/ViewHomestay/?id=6">
            <img src="${SITE_URL}/asset/img/homestay/6.jpg" alt="..." class="w-100 mt-2 mb-4">
            </a>
        </div>
        <div class="col-sm-8 mt-1" >
            <div class="card" style="height: 100%">
                <div class="card-block">
                    <div class="row justify-content-center mt-5 mb-4">
                        <div class="col-sm-12 col-md-12">
                            <h2 class="text-center">Where would you like to stay?</h2>
                        </div>
                    </div>
                    <form action="Search" method="GET">
                        <div class="row justify-content-center">
                            <div class="col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" class="form-control" id="search" name="search" placeholder="eg. Samut Prakan, Bangkok, Chaingmai">

                                </div>
                            </div>
                        </div>
                        <div class="row justify-content-center mt-2 mb-4">
                            <div class="col-sm-2 col-md-2 text-center">
                                <a class="btn btn-primary btn-lg" href="${SITE_URL}/Search">Search</a>
                            </div>
                        </div>
                    </form>  
                </div>
            </div>
        </div>
        <div class="col-2 hidden-sm-down">
            <a href="${SITE_URL}/ViewHomestay/?id=7">
            <img src="${SITE_URL}/asset/img/homestay/7.jpg" alt="..." class="w-100 mt-4 mb-2">
            </a>
            <a href="${SITE_URL}/ViewHomestay/?id=8">
            <img src="${SITE_URL}/asset/img/homestay/8.jpg" alt="..." class="w-100 mt-2 mb-4">
            </a>
        </div>
    </div>
    <div class="row hidden-sm-down">
        <div class="col-4">
            <a href="${SITE_URL}/ViewHomestay/?id=13">
            <img src="${SITE_URL}/asset/img/homestay/9.jpg" alt="..." class="d-block" style="height: 100%; width: 100%">
            </a>
        </div>
        <div class="col-2">
            <a href="${SITE_URL}/ViewHomestay/?id=27">
            <img src="${SITE_URL}/asset/img/homestay/10.jpg" alt="..." class="d-block" style="height: 100%; width: 100%">
            </a>
        </div>
        <div class="col-4">
            <a href="${SITE_URL}/ViewHomestay/?id=28">
            <img src="${SITE_URL}/asset/img/homestay/11.jpg" alt="..." class="d-block" style="height: 100%; width: 100%">
            </a>
        </div>
        <div class="col-2">
            <a href="${SITE_URL}/ViewHomestay/?id=29">
            <img src="${SITE_URL}/asset/img/homestay/12.jpg" alt="..." class="d-block" style="height: 100%; width: 100%">
            </a>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />