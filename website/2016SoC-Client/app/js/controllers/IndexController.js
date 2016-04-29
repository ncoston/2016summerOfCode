/**
 * This controller is responsible for authenticating and redirecting the user
 *
 * Since all other pages are views within the index, the index controller is constantly running.
 */
(function() {
    angular.module("2016SOC").controller("IndexController", ["$scope", "$rootScope", "$state",
        function($scope, $rootScope, $state) {
           
            $state.go("login");
                
        }
    ]);
})();