import com.musicmanager.web.exception.MyGlobal;

void workOnArray(double[] myArray, int otherInfo)
{
    int i = 0;

    if (i >= 0 && i < myArray.length)
    {
        myArray[i] = 3.14159;
    }
    else
    {
        MyGlobal.indexError = -1;
    }
}

void main() {
}
