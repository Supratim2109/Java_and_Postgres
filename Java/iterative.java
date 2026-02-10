public static void main(String[] args){
    for(int i=0; i<5;i++){
        System.out.println(i);
    }
    int i=1;
    while(i!=10){
        System.out.println("i");
        i+=1;
    }
    do{
        System.out.println(i*2);
        i+=1;
    }while(i<5);

    int [] nums = {1,2,3,4,5};
    for(int i : nums){
        System.out.println(i);
    }
}