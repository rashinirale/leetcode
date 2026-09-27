class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0; // Students preferring circular (0)
        int count1 = 0; // Students preferring square (1)
        
        // Count student preferences
        for (int student : students) {
            if (student == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        
        // Process each sandwich in the stack
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (count0 > 0) {
                    count0--;
                } else {
                    break; // No student wants type 0 anymore
                }
            } else {
                if (count1 > 0) {
                    count1--;
                } else {
                    break; // No student wants type 1 anymore
                }
            }
        }
        
        // Return the total number of students left unable to eat
        return count0 + count1;
    }
}