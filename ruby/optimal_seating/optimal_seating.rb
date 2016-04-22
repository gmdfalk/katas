#!/usr/bin/env ruby
#
# I can't find a source right now but the problem is described as follows:
# One by one, people enter a room and sit down in a fixed-length line of sequentially numbered chairs.
# Each person tries to sit as far away from other people as possible.
# There has to be at least one empty seat between each seated person in the end.

# Example input (available seats): [1,2,3,4,5,6,7,8,9]
# Example output (used seats in chronological order): [1,9,5,3,7] (or [1,9,5,7,3]).

max_seats = 17
available_seats = [*1..max_seats]




