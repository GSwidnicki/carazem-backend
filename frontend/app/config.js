module.exports = function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/");

    $stateProvider
        .state("app", {
            abstract: true,
            url: ''
        })
}