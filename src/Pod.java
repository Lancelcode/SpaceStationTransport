import java.util.HashSet;
import java.util.Set;

public class Pod {
    private static final Set<String> existingIds = new HashSet<>(); // Tracks all pod IDs

    private final String id;
    private final String type;

    public Pod(String id) {
        if (existingIds.contains(id))
        {
            throw new IllegalArgumentException("Duplicate Pod ID: " + id);
        }
        if (id == null || id.length() < 3)
        {
            throw new IllegalArgumentException("Invalid Pod ID: " + id);
        }

        this.id = id.toUpperCase();
        this.type = this.id.substring(0, 1);

        if (!type.matches("[FPT]"))
        {
            throw new IllegalArgumentException("Invalid Pod Type: " + type);
        }
        existingIds.add(this.id);  // Add this ID to the set to ensure uniqueness
    }

    public String getType()
    {
        return this.type;
    }

    public String getId()
    {
        return this.id;
    }

    @Override
    public String toString()
    {
        return this.id;
    }
}
