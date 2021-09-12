package xyz.namutree0345.parseosu;

public class OsuNote {

    public int time;
    public float beatLength;
    public int meter;
    public int sampleSet;
    public int sampleIndex;
    public int volume;
    public boolean uninherited;
    public int effects;

    public OsuNote(int time, float beatLength, int meter, int sampleSet, int sampleIndex, int volume, int uninherited, int effects) {
        this.time = time;
        this.beatLength = beatLength;
        this.meter = meter;
        this.sampleSet = sampleSet;
        this.sampleIndex = sampleIndex;
        this.volume = volume;
        this.uninherited = uninherited == 1;
        this.effects = effects;
    }
    public OsuNote(String time, String beatLength, String meter, String sampleSet, String sampleIndex, String volume, String uninherited, String effects) {
        this.time = Integer.parseInt(time);
        this.beatLength = Float.parseFloat(beatLength);
        this.meter = Integer.parseInt(meter);
        this.sampleSet = Integer.parseInt(sampleSet);
        this.sampleIndex = Integer.parseInt(sampleIndex);
        this.volume = Integer.parseInt(volume);
        this.uninherited = Integer.parseInt(uninherited) == 1;
        this.effects = Integer.parseInt(effects);
    }

}
