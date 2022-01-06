class Array{
	public static void main(String[] args){

		
		int lmt = 17;
		int c = 0;
		int average = 0;	
		int even = 2;
		int evenIndex = 0;
		int oddIndex = 0;
		int maxValue;
		int minValue;


		int[] array = new int[lmt]; //make first array with limit of numbers with value lmt
		int[] evenArray = new int[lmt]; //make second array for even numbers
		int[] oddArray = new int[lmt]; // make third array for odd numbers
		int[] randomNumbersArray = new int[lmt]; //make fourth array for random numbers

		//push array with numbers from 0 to 16
		for(int i = 0; i < 17; i++){
			array[i] = c;
			c++;
			System.out.print(array[i] + " ");
		}
		System.out.print(" - Simple array");

		c = 0;

		//push array with numbers from 0 to 16
		for(int j = 0; j < 17; j++){
			array[j] = c;
			average = average + c;
			c++;
		}

		

		average = average/c; //count average value
		System.out.println();
		System.out.println("Average number:  " + average);
		System.out.println();


		//push evenArray and oddArray

		for(int i = 1; i < 17; i++){
			
			if(i % even == 0){
				evenArray[evenIndex] = i;
				evenIndex++;
			} else{
				oddArray[oddIndex] = i;
				oddIndex++;
			}
		}


		//get even array
		for(int j = 0; j < evenArray.length; j++){
			
			if(evenArray[j] > 0){
				System.out.print(evenArray[j] + " ");
				//print value only when it's more than zero
			}
		}
		System.out.print(" -Even array");

		System.out.println();

		for(int k = 0; k < oddArray.length; k++){

			if(oddArray[k] > 0){
				System.out.print(oddArray[k] + " ");
				//print value only when it's more than zero
			}
		}

		System.out.print(" -Odd array");
		System.out.println();


		maxValue = minValue = evenArray[0]; //set value in first index of array

		for(int z = 0; z < 17; z++){

			if(evenArray[z] < minValue){
				minValue = evenArray[z];
			}
			if(evenArray[z] > maxValue){
				maxValue = evenArray[z];
			}
		}

		System.out.println("Minimal value:  " + minValue);
		System.out.println("Maximal value:  " + maxValue);

		c = 0;

		//push array with random numbers 
		for(int i = 0; i < 17; i++){
			c = (int) (Math.random() * 100); // using Math.random() method for geting random number
			randomNumbersArray[i] = c;
		}

		System.out.println();
		
		//get our array
		for(int j = 0; j < 17; j++){
			System.out.print(randomNumbersArray[j] + " ");
		}

		minValue = maxValue = randomNumbersArray[0];

		//searching a min and max value in randomNumbersValue
		for(int k = 0; k < randomNumbersArray.length; k++){

			if(randomNumbersArray[k] < minValue){
				minValue = randomNumbersArray[k];
				//if value in index less that our minValue - set this value as minValue
			}
			if(randomNumbersArray[k] > maxValue){
				maxValue = randomNumbersArray[k];
				//if value in index more that our maxValue - set this value as maxValue
			}
		}

		System.out.println();
		System.out.println("Min value in RandomNumberArray:  " + minValue);
		System.out.println("Max value in RandomNumberArray:  " + maxValue);
	}
}