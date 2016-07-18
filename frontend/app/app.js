require("angular");
require("angular-resource");
require("angular-ui-router");
var app = angular.module("CarazemApp", [
    'ngResource',
    'ui.router'

])
    .config(require("./config"));