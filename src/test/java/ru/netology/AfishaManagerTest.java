package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieEntry;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    private AfishaManager am;
    private MovieEntry movie001 = new MovieEntry(1, "Terminator", "Action", "term.png", false);
    private MovieEntry movie002 = new MovieEntry(2, "Rocky", "Action", "rocky.png", false);
    private MovieEntry movie003 = new MovieEntry(3, "First Blood", "Action", "fb.png", false);
    private MovieEntry movie004 = new MovieEntry(4, "Cobra", "Action", "cbr.png", false);
    private MovieEntry movie005 = new MovieEntry(5, "Bananas", "Action", "bananas.png", false);
    private MovieEntry movie006 = new MovieEntry(6, "Assassins", "Action", "ass.png", false);
    private MovieEntry movie007 = new MovieEntry(7, "Demolition Man", "Action", "dm.png", false);
    private MovieEntry movie008 = new MovieEntry(8, "Rambo", "Action", "rambo.png", false);
    private MovieEntry movie009 = new MovieEntry(9, "Creed", "Action", "creed.png", false);
    private MovieEntry movie010 = new MovieEntry(10, "Homefront", "Action", "hf.png", false);
    private MovieEntry movie011 = new MovieEntry(11, "Alien", "Sci-Fi", "aln.png", false);
    private MovieEntry movie012 = new MovieEntry(12, "Gravity", "Sci-Fi", "gvt.png", false);
    private MovieEntry movie013 = new MovieEntry(13, "Event Horizon", "Goofy", "aln.png", false);
    private MovieEntry movie014 = new MovieEntry(14, "Shrek", "Cartoons", "shr.png", false);
    private MovieEntry movie015 = new MovieEntry(15, "Scooby-Doo", "Cartoons", "scbd.png", false);

    @Test
    public void shouldAddManyUsingDefaultLentaSize() {
        am = new AfishaManager();
        am.add(movie001);
        am.add(movie002);
        am.add(movie003);
        am.add(movie004);
        am.add(movie005);
        am.add(movie006);
        am.add(movie007);
        am.add(movie008);
        am.add(movie009);
        am.add(movie010);
        am.add(movie011);
        am.add(movie012);
        am.add(movie013);
        am.add(movie014);
        am.add(movie015);

        MovieEntry[] expected = new MovieEntry[]{movie015, movie014, movie013, movie012, movie011, movie010, movie009, movie008, movie007, movie006};
        assertArrayEquals(expected, am.getLenta());
    }

    @Test
    public void shouldAddManyUsingCustomLentaSize() {
        am = new AfishaManager(4);
        am.add(movie001);
        am.add(movie002);
        am.add(movie003);
        am.add(movie004);
        am.add(movie005);
        am.add(movie006);
        am.add(movie007);
        am.add(movie008);
        am.add(movie009);
        am.add(movie010);

        MovieEntry[] expected = new MovieEntry[]{movie010, movie009, movie008, movie007};
        assertArrayEquals(expected, am.getLenta());
    }

    @Test
    public void shouldAddFewUsingDefaultLentaSize() {
        am = new AfishaManager();
        am.add(movie001);
        am.add(movie002);
        am.add(movie003);
        am.add(movie004);
        am.add(movie005);

        MovieEntry[] expected = new MovieEntry[]{movie005, movie004, movie003, movie002, movie001};
        assertArrayEquals(expected, am.getLenta());
    }

    @Test
    public void shouldAddFewUsingCustomLentaSize() {
        am = new AfishaManager(6);
        am.add(movie001);
        am.add(movie002);
        am.add(movie003);

        MovieEntry[] expected = new MovieEntry[]{movie003, movie002, movie001};
        assertArrayEquals(expected, am.getLenta());
    }

    @Test
    public void shouldAddNothing() {
        am = new AfishaManager();
        MovieEntry[] expected = new MovieEntry[0];
        assertArrayEquals(expected, am.getLenta());
    }
}
