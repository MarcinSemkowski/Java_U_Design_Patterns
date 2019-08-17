package Builder.classic;

import Builder.inside.house.House;

public interface HauseBuilder {

void buildWalls();
void buildFloors();
void buildRooms();
void roof();
void windows();
void doors();
void garage();


House getHouse();


}
