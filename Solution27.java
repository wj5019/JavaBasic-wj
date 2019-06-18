class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==1)return true;
        long int low=1;
        long int high=num;
        while(low<=high){
            long int mid=low+(high-low)/2;
            if(mid*mid==num) 
                return true;
            else if(mid*mid>num)
                high=mid-1;
            else 
                low=mid+1;
        }
        return false;
    }
};
