<%@page import="model.ViewBookClass"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Homestay"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-md-12">
            <div class="card">
                <h3 class="card-header">View Booking</h3>
                <div class="card-block">
                    <table class="table table-bordered text-center" style="background-color: #fff">
                        <thead>
                            <tr>
                                <th class="text-center">Booking ID</th>
                                <th class="text-center">Room ID</th>
                                <th class="text-center">Room Name</th>
                                <th class="text-center">Check in</th>
                                <th class="text-center">Check out</th>
                                <th class="text-center">Night</th>
                                <th class="text-center">Total</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% ArrayList<ViewBookClass> showBook = (ArrayList<ViewBookClass>) request.getAttribute("showBook");
                                    if (showBook != null) {
                                        for (ViewBookClass show : showBook) { %>
                            <tr>
                                <th scope="row" class="text-center"><%=show.getBooking_id()%></th>
                                <td><%=show.getRoom_name()%></td>
                                <td><%=show.getHomestay_name()%></td>
                                <td><%=show.getCheck_in()%></td>
                                <td><%=show.getCheck_out()%></td>                          
                                <td><%=show.getNight()%></td>
                                <td><%=show.getTotal()%></td>
                            </tr>
                        
                            <% } }%>
                        </tbody>
                    </table>                                  
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />