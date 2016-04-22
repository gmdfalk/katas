#!/usr/bin/env ruby
#
# I can't find a source right now but the problem is described as follows:
# One by one, people enter a room and sit down in a fixed-length line of sequentially numbered chairs.
# Each person tries to sit as far away from other people as possible.
# The game ends when a person would have to be seated next to another person.

# Example input (available seats): [1,2,3,4,5,6,7,8,9]
# Example output (used seats in chronological order): [1,9,5,3,7] (or [1,9,5,7,3]).

max_seats = 22
available_seats = [*1..max_seats]

def distance_sort(seats)
    seats
end

puts distance_sort(available_seats)

