 class Main {
		public static void main(String[] args) {
		(new Main()).init();
		}
		void print(Object o){ System.out.println(o);}
		void printt(Object o){ System.out.print(o);}

		void init(){

				char[] sub = new char[24];
				sub[0] = 'A';
				sub[1] = 'E';
				sub[2] = 'I';
				sub[3] = 'O';
				sub[4] = 'U';
				sub[5] = 'Y';
				sub[6] = 'R';
				sub[7] = 'T';
				sub[8] = 'N';
				sub[9] = 'S';
				sub[10] = 'H';
				sub[11] = 'L';
				sub[12] = 'a';
				sub[13] = 'e';
				sub[14] = 'i';
				sub[15] = 'o';
				sub[16] = 'u';
				sub[17] = 'y';
				sub[18] = 'r';
				sub[19] = 't';
				sub[20] = 'n';
				sub[21] = 's';
				sub[22] = 'h';
				sub[23] = 'l';

				char[] sub2 = new char[24];
				sub2[0] = '☀';
				sub2[1] = '☁';
				sub2[2] = '☂';
				sub2[3] = '☃';
				sub2[4] = '☄';
				sub2[5] = '★';
				sub2[6] = '☆';
				sub2[7] = '☇';
				sub2[8] = '☈';
				sub2[9] = '☉';
				sub2[10] = '☊';
				sub2[11] = '☋';
				sub2[12] = '☌';
				sub2[13] = '☍';
				sub2[14] = '☎';
				sub2[15] = '☏';
				sub2[16] = '☐';
				sub2[17] = '☑';
				sub2[18] = '☒';
				sub2[19] = '☓';
				sub2[20] = '☙';
				sub2[21] = '☚';
				sub2[22] = '☛';
				sub2[23] = '☜';

				//////////////////////////////////////////////////////


			  // int option = 0;
			  // menuStart();
			  // while(option != 3){
			  //   option = Input.readInt();

			  //   if(option == 1){
			  //     menuPreEncrypt();
			  //     int preEncryptOption = 0;
			  //     preEncryptOption = Input.readInt();
			  //     if(preEncryptOption !=0){
			  //       preEncryptOption = Input.readInt();

			  //       if(preEncryptOption > 0){
			  //         menuEncrypt();
			  //       } else {
			  //         print("\nSee you next time!");
			  //       }
			  //     }
				  
			  //   } else if(option == 2){
			  //     menuDecrypt();
			  //   } else {
			  //     print("\nSee you next time!");
			  //   }
			  // }
				

			  int option = 0; 
			  menuStart();
			  option = Input.readInt();
			  if(option == 1){
				menuPreEncrypt();
		  
				
			  } else if(option ==2){
				menuDecrypt();
			  } else{
				print("\nSee you next time!");
			  }

			
				// int option = 0;
				// while (option != 5){
				//   menu();
				//   option = Input.readInt();

				//   if(option == 1){
				//     strMEncode();
				//   }
				//   else if(option == 2){
				//     cipEncode();
				//   }
				//   else if(option == 3){
				//     fillEncode();
				//   }
				//   else if(option == 4){
				//     subEncode();
				//   } else{
				//     print("See you next time!");
				//   }

				//}
				//repEncode("jaguar","a","E");
				
				//fillEncode("The quick brown fox jumps over the lazy dog", 4 , "X");

				//subEncode("The quick brown fox jumps over the lazy dog", sub, sub2);
				//cipEncode("jaguar", 2);
			  
				
				
			}

	  void menuStart(){
		print("\n");
		print("ฅ^=>ヮ<=^₎");
		print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
		print("\n");
		print("Welcome! Thanks for using our encryption/decryption service!");
		print("\n");
		print("Do you want to encrypt or decrypt your message?");
		print("-----------------------------------------------");   
		print("1 - Encrypt");
		print("2 - Decrypt");
		print("3 - Exit");
		print("\n");
		print("Please kindly choose one.");
	  
	  }


	  void menuPreEncrypt(){
		print("\n");
		print("ฅ(＾=´ω｀=＾ฅ)");
		print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
		print("\n");
		print("You chose to Encrypt!");
		print("\n");
		print("Here are your encryption options!");
		print("-----------------------------------------------");    
		print("- String Manipulation");
		print("- Cipher");
		print("- Filler");
		print("- Substitution");
		print("-----------------------------------------------");
		
		print("\nPlease put your text here.");
		String userText = "";
		userText = Input.readString();
		
		print("\nThanks! \n\nHow many times do you want to encrypt this?");
		print("0 - Exit");
		int numOfTimes = 0; 
		numOfTimes = Input.readInt();
		
		if(numOfTimes > 0){
		  menuEncrypt();
		} else {
		  print("See you next time!");
		}
		
	  }
	  

	  void menuEncrypt(){
		print("\n");
		print("ฅ(＾=´ω｀=＾ฅ)");
		print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
		print("\n");
		print("You chose to Encrypt!");
		print("\n");
		print("Here are your encryption options!");
		print("-----------------------------------------------");    
		print("1 - String Manipulation");
		print("2 - Cipher");
		print("3 - Filler");
		print("4 - Substitution");
		print("5 - Exit");
		print("\n");
		print("Please kindly choose one.");
	  }
	  
	  void menuDecrypt(){
		print("\n");
		print("ฅ(＾=Φ ω Φ=^)ฅ");
		print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
		print("\n");
		print("You chose to Decrypt!");
		
		print("\nPlease put in your password!");
		String userPassword = "";
		userPassword = Input.readString();
		print("-----------------------------------------------");   
		print("\nPlease put your text in.");
		String userText = "";
		userText = Input.readString();
	  }


	  void strMEncode(String word){
		int half = word.length()/2;

		String firstHalf = word.substring(0,half);
		String secondHalf = word.substring(half);

		String firstHalfBld = "";
		for (int x = firstHalf.length()-1; x>=0; x--){
			   firstHalfBld += firstHalf.substring(x, x+1);
		}
		
		print(secondHalf + firstHalfBld);
	  }

	  void cipEncode(String word, int keyShift){
		String bld="";
		int ascii;
		char ch='\0';
		for(int x=0; x<=word.length()-1;x++){
		  ch=word.charAt(x);
		  ascii=(int)ch;

		  if(ascii == 90){
			ascii = 65;
		  }
		  else if( ascii == 122){
			ascii = 97;
		  }
		  else{
			ascii+=keyShift;
		  }
		  bld+= (char)ascii;
		}

		print(bld);
	  }


	  void repEncode(String word, String find, String replace){
		String bld = "";

		for(int x=0;x<=word.length()-1;x++){
		  
		  if(word.substring(x,x+1).equals(find)){
			bld+=replace;
		  } else{
			bld+=word.substring(x,x+1);
		  }
		}
		  
			print(bld);
	  }

	  void fillEncode(String word, int parts, String fill){   
		//int split = word.length()/parts;
		String bld = "";
		
		for (int x = 0 ; x<word.length(); x++){
		  bld += word.charAt(x);
		  if((x+1)%parts == 0){
			bld += fill;
		  }
		}
		  
		print(bld);
		
	  }

	 
	  int preSubEncode(char ch, char[] arry){
		for(int x=0; x<=arry.length-1; x++){
		  if(arry[x]==ch){
			return x;
		  }
		}
		return -1;
	  }
	  
	  void subEncode(String word, char[] sub, char[] sub2){
		String bld = "";
		char ch ='\0';
		int index = 0;
		for(int x=0; x<=word.length()-1; x++){
		  ch = word.charAt(x);
		  index = preSubEncode(ch,sub);
		  if(index != -1){
			bld += sub2[index];
		  }
		  else{
			bld += ch;
		  }
		}
		print(bld);
	  }
	  
	  
	}


