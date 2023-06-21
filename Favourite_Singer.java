/*
PROBLEM:
------------
Bob has a playlist of N songs, each song has a singer associated with it (denoted by an integer)

Favourite singer of Bob is the one whose songs are the most on the playlist

Count the number of Favourite Singers of Bob

Input Format 

The first line contains an integer N, denoting the number of songs in Bob's playlist.

The following input contains N integers, ith integer denoting the singer of the ith song.

Output Format

Output a single integer, the number of favourite singers of Bob

Note: Use 64 bit data type

Constraints
-------------
1<=N<=2*10^5
1<=a[i]<=10^15

*/

SOLUTION:
------------
import java.util.*;
class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] songs = new long[n];
        for (int i = 0; i < n; i++) {
            songs[i] = sc.nextLong();
        }
        long[] frequencies = countSingerFrequencies(songs);
        long maxFrequency = findMaxFrequency(frequencies);
        int favoriteSingersCount = countFavoriteSingers(frequencies, maxFrequency);
        
        System.out.println(favoriteSingersCount);
    }
    private static long[] countSingerFrequencies(long[] songs) {
        HashMap<Long, Long> frequencyMap = new HashMap<>();
        for (long singer : songs) {
            frequencyMap.put(singer, frequencyMap.getOrDefault(singer, 0L) + 1L);
        }
        long[] frequencies = new long[frequencyMap.size()];
        int index = 0;
        for (long frequency : frequencyMap.values()) {
            frequencies[index++] = frequency;
        }
        return frequencies;
    }
    private static long findMaxFrequency(long[] frequencies) {
        long maxFrequency = 0L;
        for (long frequency : frequencies) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        return maxFrequency;
    }
    private static int countFavoriteSingers(long[] frequencies, long maxFrequency) {
        int count = 0;
        for (long frequency : frequencies) {
            if (frequency == maxFrequency) {
                count++;
            }
        }
        return count;
    }
}
