<%--
  Created by IntelliJ IDEA.
  User: krs
  Date: 15.01.2023
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: krs
  Date: 14.01.2023
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->

    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="<c:url value="/user/list"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Lista użytkowników</a>
    </div>
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary"> Dodaj użytkownika</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <form method="post">
                    <div class="form-group">
                        <label for="InputName">Nazwa</label>
                        <input type="text" class="form-control" id="InputName" name="name" aria-describedby="emailHelp" placeholder="Nazwa użytkownika">
                    </div>
                    <div class="form-group">
                        <label for="InputEmail">Email</label>
                        <input type="email" class="form-control" id="InputEmail" name="email" aria-describedby="emailHelp" placeholder="Email użytkownika">
                    </div>
                    <div class="form-group">
                        <label for="InputPassword">Hasło</label>
                        <input type="password" class="form-control" id="InputPassword" name="password" aria-describedby="emailHelp" placeholder="Hasło użytkownika">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- /.container-fluid -->

<%@ include file="/footer.jsp" %>
