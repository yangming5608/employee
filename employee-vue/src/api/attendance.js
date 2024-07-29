import request from '@/utils/request'


export default {
  //1.（查询分页）
  getAttendanceListPage(current, limit, attendanceQueryVo) {
    return request({
      url: `/employee/attendance/listPage/${current}/${limit}`,
      method: "post",
      data: attendanceQueryVo
    })
  },
  getAttendance(current, limit, attendanceQueryVo) {
    return request({
      url: `/employee/attendance/getAttendance/${current}/${limit}`,
      method: "post",
      data: attendanceQueryVo
    })
  },
  //2.删除
  deleteAttendanceById(id) {
    return request({
      url: `/employee/attendance/${id}`,
      method: "delete"
    })
  },
  //3.添加
  addAttendance(attendance) {
    return request({
      url: `/employee/attendance`,
      method: "post",
      data: attendance
    })
  },
  //4.根据id查询
  getAttendanceById(id) {
    return request({
      url: `/employee/attendance/${id}`,
      method: "get"
    })
  },
  //修改
  updateAttendance(attendance) {
    return request({
      url: `/employee/attendance`,
      method: "put",
      data: attendance
    })
  },
  //查询所有
  getAttendanceList() {
    return request({
      url: `/employee/attendance/list`,
      method: "get"
    })
  },
  //审核通过
  updateAttendanceOk(id) {
    return request({
      url: `/employee/attendance/updateAttendanceOk/${id}`,
      method: "put"
    })
  },
  //不通过
  updateAttendanceNo(id) {
    return request({
      url: `/employee/attendance/updateAttendanceNo/${id}`,
      method: "put"
    })
  },

}
