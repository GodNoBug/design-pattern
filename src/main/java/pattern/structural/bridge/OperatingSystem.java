package pattern.structural.bridge;

public abstract class OperatingSystem {
    // 聚合 声明videoFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
