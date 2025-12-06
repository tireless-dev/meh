package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CircleStroke: ImageVector
  get() {
    val current = _circleStroke
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CircleStroke",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f,
      ).apply {
        // M8 4 a4 4 0 1 1 -4 4 4 4 0 0 1 4 -4 m0 -2 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 4
          moveTo(x = 8.0f, y = 4.0f)
          // a 4 4 0 1 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 6 6 0 1 0 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // a 6 6 0 0 0 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
        }
        // <rect width="16" height="16" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
      }.build()
      .also { _circleStroke = it }
  }

@Suppress("ObjectPropertyName")
private var _circleStroke: ImageVector? = null
