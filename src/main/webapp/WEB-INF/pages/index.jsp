<%--
  Created by IntelliJ IDEA.
  User: goodl
  Date: 9/7/2015
  Time: 9:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Braidner Blog</title>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic">
    <meta name="viewport" content="initial-scale=1" />
</head>
<body layout="column" ng-controller="AppCtrl">

<md-toolbar layout="row">
    <div class="md-toolbar-tools">
        <md-button ng-click="toggleSidenav('left')" hide-gt-sm class="md-icon-button">
            <md-icon aria-label="Menu" md-svg-icon="https://s3-us-west-2.amazonaws.com/s.cdpn.io/68133/menu.svg"></md-icon>
        </md-button>
        <h1>Hello World</h1>
    </div>
</md-toolbar>
<div layout="row" flex>
    <md-sidenav layout="column" class="md-sidenav-left md-whiteframe-z2" md-component-id="left" md-is-locked-open="$mdMedia('gt-sm')">

    </md-sidenav>
    <div layout="column" flex id="content">
        <md-content layout="column" flex class="md-padding">

        </md-content>
    </div>
</div>

<!-- Angular Material Dependencies -->
<script src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-animate.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-aria.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
</body>
</html>
