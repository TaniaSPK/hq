class DatesController < ApplicationController
  load_and_authorize_resource class: EventDate

  before_filter :find_event

  def index
    @visitor = VisitorEventDate.new
    @current = current_user || current_student
  end

  private

  def find_event
    @event = Event.find(params[:event_id])
  end

end