local map = ...
-- Dungeon 6 1F

local function are_all_torches_on()

  return torch_1 ~= nil
      and torch_1:get_sprite():get_animation() == "lit"
      and torch_2:get_sprite():get_animation() == "lit"
end

local function lock_torches()
  torch_1:remove()
  torch_2:remove()
end

function map:on_started(destination)

  if map:get_game():get_value("b313") then
    -- the torches are lit
    lock_torches()
  elseif not torches_chest:is_open() then
    torches_chest:set_enabled(false)
  end
end

function map:on_opening_transition_finished(destination)

  -- show the welcome message
  if destination:get_name() == "from_outside" then
    map:start_dialog("dungeon_6.welcome")
  end
end

function map:on_update()

  if not map:get_game():get_value("b313")
    and are_all_torches_on() then

    sol.audio.play_sound("chest_appears")
    torches_chest:set_enabled(true)
    map:get_game():set_value("b313", true)
    lock_torches()
  end
end



