#!/usr/bin/env ruby

def traverse_directory_tree(location, depth_counter=0)
    Dir[location + '/*'].each { |f|
        if File.directory? f
            puts f
            traverse_directory_tree(f, depth_counter += 1)
        end
    }

    depth_counter
end

puts traverse_directory_tree('/boot')
