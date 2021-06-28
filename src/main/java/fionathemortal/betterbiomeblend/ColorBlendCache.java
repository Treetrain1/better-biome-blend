package fionathemortal.betterbiomeblend;

public final class ColorBlendCache
{
    int    blendRadius;
    byte[] color;

    float[] R;
    float[] G;
    float[] B;

    public ColorBlendCache(int blendRadius)
    {
        int genCacheDim = 16 + 2 * blendRadius;

        this.blendRadius = blendRadius;
        this.color = new byte[3 * genCacheDim * genCacheDim];

        this.R = new float[genCacheDim];
        this.G = new float[genCacheDim];
        this.B = new float[genCacheDim];
    }
}
