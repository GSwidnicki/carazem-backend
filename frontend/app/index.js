require("angular");
require("angular-resource");
require("angular-ui-router");
angular.module("CarazemApp", [
    'ngResource',
    'ui.router'

])
    .config(require("./config"));