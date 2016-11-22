public class Processor extends Thread
{
    WriteBuffer writeBuffer;
    MemoryAgent memoryAgent;
    MainMemory mainMemory;
    public int id;

    public Processor(int id, WriteBuffer wb, MainMemory mM, MemoryAgent mA)
    {
        this.writeBuffer = wb;
        this.memoryAgent = mA;
        this.mainMemory = mM;
        this.id = id;
    }

    public void run()
    {
        
    }
}