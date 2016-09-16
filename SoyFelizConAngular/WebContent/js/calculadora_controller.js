var app = angular.module('calculadora', []);
app.controller("CalculadoraController", function($scope) {
	
	$scope.operacionFuncion=function operacionFuncion() {
		var num1= $scope.num1;
		var num2 = $scope.num2;
		switch($scope.operacion){
		
	
		case "Sumar":
			$scope.resultado = num1 + num2;
			break;
			
		case "Restar":
			$scope.resultado = num1 - num2;
			break;
			
		case "Multiplicar":
			$scope.resultado = num1 * num2;
			break;
			
		case "Dividir":
			$scope.resultado = num1 / num2;
			break;
		default:
	}
	}
});