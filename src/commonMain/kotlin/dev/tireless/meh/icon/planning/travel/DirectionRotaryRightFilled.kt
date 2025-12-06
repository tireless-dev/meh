package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRotaryRightFilled: ImageVector
  get() {
    val current = _directionRotaryRightFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionRotaryRightFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="11.0" cy="11.0" radius="3.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 11
          moveTo(x = 11.0f, y = 11.0f)
          // m -3 0
          moveToRelative(dx = -3.0f, dy = 0.0f)
          // a 3 3 0 1 1 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
          // a 3 3 0 1 1 -6 0z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-8 16 -1.41 -1.41 L23.17 12 H15.9 a5 5 0 0 1 -3.9 3.9 V26 h-2 V15.9 a5 5 0 1 1 5.9 -5.9 h7.27 L18.6 5.41 20 4 l7 7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -8 16
          moveToRelative(dx = -8.0f, dy = 16.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 23.17 12
          lineTo(x = 23.17f, y = 12.0f)
          // H 15.9
          horizontalLineTo(x = 15.9f)
          // a 5 5 0 0 1 -3.9 3.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.9f,
            dy1 = 3.9f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 15.9
          verticalLineTo(y = 15.9f)
          // a 5 5 0 1 1 5.9 -5.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.9f,
            dy1 = -5.9f,
          )
          // h 7.27
          horizontalLineToRelative(dx = 7.27f)
          // L 18.6 5.41
          lineTo(x = 18.6f, y = 5.41f)
          // L 20 4
          lineTo(x = 20.0f, y = 4.0f)
          // l 7 7z
          lineToRelative(dx = 7.0f, dy = 7.0f)
          close()
        }
        // m20 4 -1.41 1.41 L23.17 10 H15.9 a5 5 0 1 0 -5.9 5.9 V26 h2 V15.9 a5 5 0 0 0 3.9 -3.9 h7.27 l-4.58 4.59 L20 18 l7 -7Z m-9 10 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
        path {
          // M 20 4
          moveTo(x = 20.0f, y = 4.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 23.17 10
          lineTo(x = 23.17f, y = 10.0f)
          // H 15.9
          horizontalLineTo(x = 15.9f)
          // a 5 5 0 1 0 -5.9 5.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -5.9f,
            dy1 = 5.9f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 15.9
          verticalLineTo(y = 15.9f)
          // a 5 5 0 0 0 3.9 -3.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.9f,
            dy1 = -3.9f,
          )
          // h 7.27
          horizontalLineToRelative(dx = 7.27f)
          // l -4.58 4.59
          lineToRelative(dx = -4.58f, dy = 4.59f)
          // L 20 18
          lineTo(x = 20.0f, y = 18.0f)
          // l 7 -7z
          lineToRelative(dx = 7.0f, dy = -7.0f)
          close()
          // m -9 10
          moveToRelative(dx = -9.0f, dy = 10.0f)
          // a 3 3 0 1 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _directionRotaryRightFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionRotaryRightFilled: ImageVector? = null
