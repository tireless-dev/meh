package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRotaryFirstRightFilled: ImageVector
  get() {
    val current = _directionRotaryFirstRightFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionRotaryFirstRightFilled",
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
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-2 24 H16 v-2 h6.59 l-8.84 -8.83 A5 5 0 0 1 12 15.9 V26 h-2 V15.9 a5.01 5.01 0 1 1 5.17 -2.15 L24 22.6 V16 h2Z
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
          // m -2 24
          moveToRelative(dx = -2.0f, dy = 24.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6.59
          horizontalLineToRelative(dx = 6.59f)
          // l -8.84 -8.83
          lineToRelative(dx = -8.84f, dy = -8.83f)
          // A 5 5 0 0 1 12 15.9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 15.9f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 15.9
          verticalLineTo(y = 15.9f)
          // a 5.01 5.01 0 1 1 5.17 -2.15
          arcToRelative(
            a = 5.01f,
            b = 5.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.17f,
            dy1 = -2.15f,
          )
          // L 24 22.6
          lineTo(x = 24.0f, y = 22.6f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // M11 14 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m13 2 v6.59 l-8.83 -8.84 A5 5 0 1 0 10 15.9 V26 h2 V15.9 a5 5 0 0 0 1.75 -.73 L22.6 24 H16 v2 h10 V16Z
        path {
          // M 11 14
          moveTo(x = 11.0f, y = 14.0f)
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
          // m 13 2
          moveToRelative(dx = 13.0f, dy = 2.0f)
          // v 6.59
          verticalLineToRelative(dy = 6.59f)
          // l -8.83 -8.84
          lineToRelative(dx = -8.83f, dy = -8.84f)
          // A 5 5 0 1 0 10 15.9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 15.9f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 15.9
          verticalLineTo(y = 15.9f)
          // a 5 5 0 0 0 1.75 -0.73
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.75f,
            dy1 = -0.73f,
          )
          // L 22.6 24
          lineTo(x = 22.6f, y = 24.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 16z
          verticalLineTo(y = 16.0f)
          close()
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
      .also { _directionRotaryFirstRightFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionRotaryFirstRightFilled: ImageVector? = null
