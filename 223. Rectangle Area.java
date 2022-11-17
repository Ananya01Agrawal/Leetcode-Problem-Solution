class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //overlap area of the x axis
       int xoverlap=Math.max(ax1,bx1)-Math.min(ax2,bx2);
        if(Math.max(ax1,bx1)>Math.min(ax2,bx2)) xoverlap=0;
        //overlap area of the ny axis
       int yoverlap=Math.max(ay1,by1)-Math.min(ay2,by2);
        if(Math.max(ay1,by1)>Math.min(ay2,by2)) yoverlap=0;

        int overlapArea=xoverlap*yoverlap;//calculating the overlap area

        int areaA = (ax2 - ax1) * (ay2 - ay1); 
        int areaB = (bx2 - bx1) * (by2 - by1);

        return areaA + areaB - overlapArea; // substract the overlap area so we don't count it twice
    }
}
