class Solution {
public int countStudents(int[] students, int[] sandwiches) {
    int n  = students.length;
    Queue<Integer> stud = new ArrayDeque<>();
    for(int student : students){
        stud.offer(student);
    }
    int res = n;
    for(int sandwich : sandwiches){
        int count = 0;
        while(count<n && stud.peek()!= sandwich){
            stud.offer(stud.poll());
            count++;
        }
        if(stud.peek() == sandwich ){
            stud.poll();
            res--;
        } else{
            break;
        }
    }
return res;
}
}