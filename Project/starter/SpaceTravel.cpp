#include <stdlib.h>
#include <stdio.h>
#include <iostream>
#include "linux/jni_md.h"
#include "jni.h"
#include "SpaceTravel.h"

using namespace std;

int measureDistance(double s, double t){
  int distance = s*t;
  return distance;
}
JNIEXPORT jint JNICALL Java_SpaceTravel_measureDistance
  (JNIEnv *, jclass obj, jdouble s, jdouble t){
    int distance = s * t;
    return distance;
  }

int main(){
  double s,t;
  cout << "Input speed" << "\n";
  cin >> s;
  cout << "Input time" << "\n";
  cin >> t;
  cout<< "The distance is " << measureDistance(s,t) << "\n";

  return 0;
}
